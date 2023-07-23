
public class Interfaces {
    public static void main(String[] args) {
        // Queen q = new Queen();
        // q.moves();
        Bear b = new Bear();
        b.eat();
    }
}
// Trying to acheive multiple inheritance 
interface Herbivore{
    void eat();
}
interface Carnivore{
    void eat();
}
class Bear implements Herbivore,Carnivore{
    public void eat(){
        System.out.println("Bear eats both grass and Meat");
    }
}
// Trying to acheive 100% Abstraction
// interface ChessPlayer{
//     void moves();
// }
// class Queen implements ChessPlayer{
//     public void moves(){
//         System.out.println("Up,Down,Left,Right,Diagonal(in all 4 direction)");
//     }
// }
// class King implements ChessPlayer{
//     public void moves(){
//         System.out.println("Up,Down,Left,Right,diagonal(by 1 step)");
//     }
// }
// class Rook implements ChessPlayer{
//     public void moves(){
//         System.out.println("Up,Down,Left,right");
//     }
// }