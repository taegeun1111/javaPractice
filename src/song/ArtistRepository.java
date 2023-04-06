package song;

import bookLogin.StringList;

public class ArtistRepository {

    public static Artist[] artistList;

    static {
        artistList = new Artist[0];
    }

    //신규 가수를 첫 노래와 함께 배열에 추가하는 기능
    public void addNewArtist(String artistName, String songName){
        //1.가수 객체 생성
        Artist artist = new Artist(artistName,new StringList(songName));
//        //2.생성된 가수 객체에 전달받은 이름 셋팅
//        artist.setName(artistName);
//        //3.생성된 가수 객체에 노래 목록을 생성해서 셋팅
//        artist.setSongList(new StringList());
//        //4.해당 노래목록에 전달받은 노래 추가
//        artist.getSongList().push(songName);
//        //5.가수배열에 해당 가수 객체 추가
        Artist[] temp = new Artist[artistList.length+1];
        for (int i = 0; i < artistList.length; i++) {
            temp[i] = artistList[i];
        }
        temp[temp.length-1] = artist;
        artistList=temp;
    }

    public boolean isRegistered(String artistName){
        return findArtistByName(artistName)!=null;
    }
    public Artist findArtistByName(String artistName){
        for (Artist artist : artistList) {
            artist.equals(artistName);
            return artist;
        }
        return null;
    }

    public boolean addNewSong(String artistName,String songName){
        Artist foundArtist = findArtistByName(artistName);
        StringList songList = foundArtist.getSongList();

        if(!songList.includes(songName)){
            songList.push(songName);
            return true;
        }
        return false;
    }

    //특정 가수의 노래목록을 반환하는 기능
    public String[] getSongList(String artistName){
        String[] getsArr = findArtistByName(artistName).getSongList().getsArr();
        return getsArr;
    }
    public int count(){
        return artistList.length;
    }





}
