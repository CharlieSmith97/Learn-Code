//线程中的并行与并发
package 核心类库_线程Part1;

public class P242 {
    public static void main(String[] args) {
        playGame();
        listenMusic();
    }
    private static void playGame() {
        for (int i = 0; i < 50; i++) {
            System.out.println("玩游戏！");
        }
    }

    private static void listenMusic(){
        for (int i = 0; i < 50; i++) {
            System.out.println("在听歌！");
        }
    }
}
