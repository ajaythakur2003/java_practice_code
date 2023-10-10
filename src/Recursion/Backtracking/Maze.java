package Recursion.Backtracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(maze(3,3));
//        path("", 3, 3);
//        System.out.println(pathRet("", 3,3));
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathRestriction("", board, 0, 0);
    }
    static int maze(int r , int c){
        if (r == 1 || c == 1){
            return 1;
        }
        int left = maze(r - 1, c);
        int right = maze(r, c - 1);

        return left + right;
    }

    static ArrayList<String> pathRet(String p, int r, int c){
        if(r == 1 && c == 1){
//            System.out.println(p);
//            return;
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r > 1 && c > 1){
            list.addAll(pathRet(p + 'D', r - 1, c - 1));
        }
        if (r > 1) {
            list.addAll(pathRet(p + 'V', r - 1, c));
        }
        if (c > 1){
            list.addAll(pathRet(p + 'H', r, c - 1));
        }

        return list;

    }

    static void pathRestriction(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]){
            return;
        }

        if (r < maze.length - 1) {
            pathRestriction(p + 'V', maze, r + 1, c);
        }
        if (c < maze[0].length - 1){
            pathRestriction(p + 'H', maze, r, c + 1);
        }

        if(r < maze.length - 1 && c < maze[0].length - 1){
            pathRestriction(p + 'D', maze, r + 1, c + 1);
        }

        return ;

    }
}
