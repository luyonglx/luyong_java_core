package cn.com.luyong.core.game2048;

import java.util.Random;
import java.util.Scanner;
 
/*
 * 游戏：2048
 */
public class Game2048 {
    public static void main(String[] args) {
        int[][] nums = new int[4][4];
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        final String UP = "w";
        final String DOWN = "s";
        final String LEFT = "a";
        final String RIGHT = "d";
        String direction;
        boolean gameOverFlag;
         
        int location1 = r.nextInt(16);
        int location2 = r.nextInt(16);
        while (location1 == location2){
            location2 = r.nextInt(16);
        }
        nums[location1/4][location1%4] = (r.nextInt(2)+1) * 2;
        nums[location2/4][location2%4] = (r.nextInt(2)+1) * 2;
         
         
        while (true){
            gameOverFlag = true;
             
            for (int row = 0; row < 4; row ++){
                for (int col = 0; col < 4; col ++){
                    System.out.print(nums[row][col] + "\t");
                }
                System.out.println();
            }
             
            //判断游戏是否结束，若数组中全是非零的元素且没有相同的相邻的元素，则游戏结束。
            
            
            A:for (int m = 0; m < 4; m ++){
                B:for (int col = 0; col < 3; col ++){
                    C:for (int i = col + 1; i < 4; i ++){
                        if (nums[m][col] == 0 || nums[m][i] == 0 || nums[m][col] == nums[m][i]){
                            gameOverFlag = false;
                            break A;
                        }else if (nums[m][col] != nums[m][i]){
                            break C;
                        }
                    }
                }
             
                D:for (int row = 0; row < 3; row ++){
                    E:for (int j = row + 1; j < 4; j ++){
                        if (nums[row][m] == nums[j][m]){
                            gameOverFlag = false;
                            break A;
                        }else if (nums[row][m] != nums[j][m]){
                            break E;
                        }
                    }
                }
            }
             
            if (gameOverFlag == true){
                System.out.println("Game Over!");
                break;
            }
             
            System.out.println("please input direction:(w:UP; s:DOWN; a:LEFT; d:RIGHT)");
            direction = s.next();
             
            if (UP.equalsIgnoreCase(direction)){
                for (int col  = 0; col < 4; col ++){
                    for (int row = 0; row < 3; row ++){
                        for (int j = row + 1; j < 4; j ++){
                            if ((nums[row][col] == 0) || (nums[row][col] != nums[j][col] && nums[j][col] != 0)){
                                break;
                            }else if (nums[row][col] == nums[j][col]){
                                nums[row][col] += nums[j][col];
                                nums[j][col] = 0;
                                row = j;
                                break;
                            }
                        }
                    }
                     
                    for (int row2 = 0; row2 < 3; row2 ++){
                        for (int j = row2 + 1; j < 4; j ++){
                            if (nums[row2][col] != 0){
                                break;
                            }else if (nums[row2][col] == 0 && nums[j][col] != 0){
                                nums[row2][col] = nums[j][col];
                                nums[j][col] = 0;
                                break;
                            }
                        }
                    }
                }
            }else if (DOWN.equalsIgnoreCase(direction)){
                for (int col  = 3; col >= 0; col --){
                    for (int row = 3; row > 0; row --){
                        for (int j = row - 1; j >= 0; j --){
                            if ((nums[row][col] == 0) || (nums[row][col] != nums[j][col] && nums[j][col] != 0)){
                                break;
                            }else if (nums[row][col] == nums[j][col]){
                                nums[row][col] += nums[j][col];
                                nums[j][col] = 0;
                                row = j;
                                break;
                            }
                        }
                    }
                     
                    for (int row2 = 3; row2 > 0; row2 --){
                        for (int j = row2 - 1; j >= 0; j --){
                            if (nums[row2][col] != 0){
                                break;
                            }else if (nums[row2][col] == 0 && nums[j][col] != 0){
                                nums[row2][col] = nums[j][col];
                                nums[j][col] = 0;
                                break;
                            }
                        }
                    }
                }
            }else if (LEFT.equalsIgnoreCase(direction)){
                for (int row  = 0; row < 4; row ++){
                    for (int col = 0; col < 3; col ++){
                        for (int j = col + 1; j < 4; j ++){
                            if ((nums[row][col] == 0) || (nums[row][col] != nums[row][j] && nums[row][j] != 0)){
                                break;
                            }else if (nums[row][col] == nums[row][j]){
                                nums[row][col] += nums[row][j];
                                nums[row][j] = 0;
                                col = j;
                                break;
                            }
                        }
                    }
                     
                    for (int col2 = 0; col2 < 3; col2 ++){
                        for (int j = col2 + 1; j < 4; j ++){
                            if (nums[row][col2] != 0){
                                break;
                            }else if (nums[row][col2] == 0 && nums[row][j] != 0){
                                nums[row][col2] = nums[row][j];
                                nums[row][j] = 0;
                                break;
                            }
                        }
                    }
                }
            }else if (RIGHT.equalsIgnoreCase(direction)){
                for (int row  = 3; row >= 0; row --){
                    for (int col = 3; col > 0; col --){
                        for (int j = col - 1; j >= 0; j --){
                            if ((nums[row][col] == 0) || (nums[row][col] != nums[row][j] && nums[row][j] != 0)){
                                break;
                            }else if (nums[row][col] == nums[row][j]){
                                nums[row][col] += nums[row][j];
                                nums[row][j] = 0;
                                col = j;
                                break;
                            }
                        }
                    }
                     
                    for (int col2 = 3; col2 > 0; col2 --){
                        for (int j = col2 - 1; j >= 0; j --){
                            if (nums[row][col2] != 0){
                                break;
                            }else if (nums[row][col2] == 0 && nums[row][j] != 0){
                                nums[row][col2] = nums[row][j];
                                nums[row][j] = 0;
                                break;
                            }
                        }
                    }
                }
            }else {
                System.out.println("The direction is false!");
            }
             
            location1 = r.nextInt(15);
            while (nums[location1/4][location1%4] != 0){
                location1 = r.nextInt(15);
            }
            nums[location1/4][location1%4] = (r.nextInt(2) + 1) * 2;
        }
    }
}