package ge.tchkoi;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Lady double dealer", 4.6);
        album.addSong("High ball shooter", 4.22);
        album.addSong("Hold on", 4.33);
        album.addSong("Holy man", 3.5);
        album.addSong("The gypsy", 3.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("I put the finer on you", 3.45);
        album.addSong("Lets go",3.22);
        album.addSong("Evil walks",4.21);
        album.addSong("Snowballed",2.56);
        album.addSong("Inject the venom",4.54);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("High ball shooter", playList);
        albums.get(0).addToPlaylist("Holy man", playList);
        albums.get(0).addToPlaylist("Speed King", playList);
        albums.get(0).addToPlayList(7,playList);
        albums.get(1).addToPlayList(4,playList);
        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(5,playList);
        albums.get(1).addToPlayList(9,playList);

        play (playList);
    }
        private static void play (LinkedList<Song> playList) {
            Scanner scanner = new Scanner(System.in);
            boolean quit = false;
            boolean forward =true;

            ListIterator <Song> listIterator = playList.listIterator();
            if (playList.size() == 0) {
                System.out.println("No songs in playlist");
                return;
            } else {
                System.out.println("Now playing " + listIterator.next().toString());
                printMenu();
            }

            while (!quit) {
                int action = scanner.nextInt();
                scanner.nextLine();
                switch (action) {

                    case 0:
                        System.out.println("PLayList is complete.");
                        quit = true;
                        break;

                    case 1:
                        if (!forward) {
                            if (listIterator.hasNext()) {
                                listIterator.next();
                            }
                            forward= true;
                        }
                        if (listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().toString());
                        } else {
                            System.out.println("We have reached end of the playlist");
                            forward = false;
                        }
                        break;
                    case 2:
                        if (forward) {
                            if (listIterator.hasPrevious()) {
                                listIterator.previous();
                            }
                            forward = false;
                        }
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().toString());
                        } else {
                            System.out.println("We are at the start of the playlist");
                            forward = true;
                        }
                        break;
                    case 3:
                        if (forward) {
                            if (listIterator.hasPrevious()) {
                                System.out.println("Now replying " + listIterator.previous().toString());
                                forward = false;
                            } else {
                                System.out.println("We are at the start of the playlist");
                            }
                        } else {
                            if (listIterator.hasNext()) {
                                System.out.println("Now replaying " +listIterator.next().toString());
                                forward = true;
                            } else {
                                System.out.println("We have reached the end of the playlist");
                            }
                        }
                        break;
                    case 4:
                        printList (playList);
                        break;
                    case 5:
                        printMenu();
                        break;
                    case 6:
                        if (playList.size() > 0) {
                            listIterator.remove();
                            if (listIterator.hasNext()) {
                                System.out.println("Now playing " + listIterator.next());
                            } else if (listIterator.hasPrevious()) {
                                    System.out.println("Now playing " + listIterator.previous());

                            }
                        }
                        break;
                }
            }

        }

        private static void printMenu() {
            System.out.println("Available actions:\npress");
            System.out.print("0 - to quit\n");
            System.out.print("1 - to play next song\n");
            System.out.print("2 - to play previous song\n");
            System.out.print("3 - to replay the current song\n");
            System.out.print("4 - list songs in the playlist\n");
            System.out.print("5 - print available actions\n");
            System.out.println("6 - delete current song from playlist");
        }

        private static void printList(LinkedList<Song> playList) {
            Iterator<Song> iterator = playList.iterator();
            System.out.println("============================");
            while (iterator.hasNext()) {
                System.out.println(iterator.next().toString());
            }
            System.out.println("============================");
        }
}
