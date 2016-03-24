package c4q.lighterletter.robot;

import java.util.Stack;

/**
 * Created by c4q-john on 3/23/16.
 *
 * Created by afermin on 3/23/16.
 *
 * Coded by Alvin Kuang
 *
 * The Robot can only go right and down in a 2d grid. Some spaces are invalid (lava).
 * Write a method that returns a valid path to the bottom right of the grid
 *
 */


public class Main {

    public static void findPath(boolean[][] grid, int row, int col, Stack<Character> path) {

        if (path.size() == ((row-1)+(col-1))) {
            return;
        }

        if (grid[row+1][col] == false || row != grid.length) {
            path.push('D');
            findPath(grid, row, col+1, path);
        } else  if (grid[row][col+1] || col != grid[0].length){
            path.push('R');
            findPath(grid, row+1, col, path);
        }

    }
}