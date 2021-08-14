package com.Array;

import java.util.Objects;

/**
 * 为某个酒店编写程序模拟酒店管理系统, 模拟订房,退房,打印所有房间状态等功能
 * 1. 该系统的用户是酒店前台
 * 2. 酒店中所有的房间使用一个二维数组来模拟
 * 3. 酒店中的每一个房间应该是一个java对象:Room
 * 4. 每一个房间Room应该有房间编号,房间类型属性,房间是否空闲属性.
 * 5. 系统应该对外提供的功能:
 * * 可以预定房间: 用户输入房间编号订房
 * * 可以退房: 用户输入房间编号退房
 * * 可以查看所有房间的状态: 用户输入某个指令应该可以查看所有房间状态
 */
public class ArrayTest08 {
    public static void main(String[] args) {
        Room[][] rooms=new Room[3][4];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                rooms[i][j] = new Room();
            }
        }

        Hotel hotel = new Hotel(rooms);
        int[] room_no = {2,4};
        hotel.order(room_no);
        int[] room_no2 = {2,3};
        hotel.order(room_no2);
        hotel.showAllRoomState();
    }
}

class Hotel {
    private Room[][] _rooms;

    Hotel() {

    }

    Hotel(Room[][] rooms) {
        this._rooms = rooms;
    }

    public boolean order(int[] room_no) {
        int row = room_no[0]-1;
        int col = room_no[1]-1;
        if (row >= this._rooms.length || col >= this._rooms[row].length) {
            System.out.println("查找失败,无此房间");
            return false;
        }
        boolean isOpen = this._rooms[row][col].isOpen();
        if (isOpen) {
            System.out.println("房间已经占了");
            return false;
        } else {
            this._rooms[row][col].setOpen(true);
            return true;
        }
    }

    public void showAllRoomState() {
        for (int i = 0; i < this._rooms.length; i++) {
            System.out.println("*********第" + (i + 1) + "层*********");
            for (int j = 0; j < this._rooms[i].length; j++) {
                String state = this._rooms[i][j].isOpen() ? "开" : "关";
                System.out.println("-------第" + (j + 1) + "列----" + state + "-----");
            }

        }
    }
}

class Room {
    private String room_no;
    private String type;
    private boolean isOpen;

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }


}
