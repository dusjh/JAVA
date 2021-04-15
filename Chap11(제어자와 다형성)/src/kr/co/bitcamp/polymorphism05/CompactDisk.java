package kr.co.bitcamp.polymorphism05;

// 자손클래스 2
public class CompactDisk extends Product {
    
    private String albumTitle;
    private String artist;
    
    // 생성자
    public CompactDisk(int productID, String description, String maker, int price, String albumTitle, String artist) {
        super(productID, description, maker, price);
        this.albumTitle = albumTitle;
        this.artist = artist;
    }

    // getter() 제공
    public String getAlbumTitle() {
        return albumTitle;
    }

    public String getArtist() {
        return artist;
    }
    
    @Override
    public void showInfo() {       
        super.showInfo();  // 조상클래스의 메서드를 명시적으로 호출 (showInfo 호출)
        System.out.println("앨범 제목: "+this.getAlbumTitle());
        System.out.println("가수: "+this.getArtist());
    }
}
