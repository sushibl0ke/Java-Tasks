public class Reverser {
  
  public static int[] reverse(int[] kys) {
    return java.util.stream.IntStream.range(0, kys.length).map(e -> kys[kys.length - 1 - e]).toArray();
  }
  
}
