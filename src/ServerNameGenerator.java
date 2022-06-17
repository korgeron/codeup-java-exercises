public class ServerNameGenerator {

    static String[] nounArr = {"boy", "girl", "dog", "ball", "car", "river", "ice", "cup", "bed", "beard"};
    static String[] adjArr = {"awful", "bad", "good", "beautiful", "attractive", "hateful", "long", "angry", "amused", "average"};

    public static String randomNumber(String[] arr) {
        int random = (int) (Math.random() * arr.length);
        return arr[random];
    }

    public static void main(String[] args) {
        System.out.printf("Here is your server name: \n%s-%s", randomNumber(nounArr), randomNumber(adjArr));
    }
}
