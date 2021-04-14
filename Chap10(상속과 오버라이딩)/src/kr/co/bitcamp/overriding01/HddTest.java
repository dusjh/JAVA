package kr.co.bitcamp.overriding01;

public class HddTest {

    public static void main(String[] args) {
        
        HddDisk hDisk = new HddDisk(500, 7200);
        System.out.println("HDD 상세");
        System.out.println(hDisk.status());
        System.out.println();
        
        UsbMemory uMemory = new UsbMemory(30, 1000);
        System.out.println("UsbMemory 상세");
        System.out.println(uMemory.status());
        
        System.out.println(uMemory.status(777));
    }
}
