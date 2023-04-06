package song;

import bookLogin.util.Utility;

import static bookLogin.util.Utility.*;

public class ArtistView {
    ArtistRepository repository;

    public void start(){
//        input("")
        while (true) {
            System.out.println("****음악 관리 프로그램****");
            System.out.println("1. 노래 등록하기");
            System.out.println("2. 노래 정보 검색");
            System.out.println("3. 프로그램 종료");
            String inputNum = input(">>");
            switch (inputNum){
                case "1" :
                    insertSong();
                    break;
                case "2" :
                    searchSong();
                    break;
                case "3" :
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
            }
        }

    }
    private void searchSong() {
    }

    private void insertSong() {
        String artistName = input("-가수명");
        String songName = input("-곡명");
        repository.addNewArtist(artistName,songName);
        System.out.printf("#아티스트 %s님이 신규 등록되었습니다.",artistName);

    }
}
