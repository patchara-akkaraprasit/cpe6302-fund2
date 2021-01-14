//3 collaborators
//1.พัชร อัครประสิทธิ์ 6030300741
//2.ณัฐพงค์ ตื่มสูงเนิน 6030300318
//3.กัลยารัตน์ ศรีชัย 6030300075
package cinema;

import java.util.Scanner; // Import the Scanner class

public class Cinema {

  void soldTickets() {
    // คำนวณรายได้จากการขายตั๋ว
    int price;
    int pricef = 100;
    int priceb = 80;
    int total = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("จำนวน แถวที่นั่ง");
    int row = sc.nextInt();
    System.out.println("จำนวนที่นั่งในแต่ละแถว");
    int col = sc.nextInt();
    int num = row * col;
    if (num < 60) {
      price = 100;
      total = num * price;
      System.out.println("รายได้จากการจำหน่ายตั๋ว");
      System.out.print(total);
    }
    if (num > 60) {
      for (int x = 0; x < row; x++) {
        if (x < row / 2) {
          total += pricef * col;
        } else {
          total += priceb * col;
        }
      }
      System.out.println(total);
    }
  }

  void showSeats(int numRow, int numCol) {
    // แสดงข้อมูลที่นั่ง
    char[][] seats = new char[numRow][numCol];
    for (int x = 0; x < numRow; x++) {
      for (int y = 0; y < numCol; y++) {
        seats[x][y] = 'y';
      }
    }
    for (int y = 0; y <= numCol; y++) {
      if (y == 0) {
        System.out.print("  ");
      } else {
        System.out.print(y);
        System.out.print(" ");
      }
    }
    System.out.println("");
    for (int x = 0; x < numRow; x++) {
      System.out.print(x + 1);
      System.out.print(" ");
      for (int y = 0; y < numCol; y++) {
        System.out.print(seats[x][y]);
        System.out.print(" ");
      }
      System.out.println("");
    }
  }

  public static void main(String[] args) {
    Cinema cinema = new Cinema();
    cinema.showSeats(7, 8);
    cinema.soldTickets();

  }
}
