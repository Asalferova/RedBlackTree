package RedBlackTree;
public class Main {  
    public static void main(String[] args) {   //метод main для к-ч дерева
        final RedBlackTree tree = new RedBlackTree();  // создание дерева и заполнение тестовыми значениями
        try {
                
            tree.add(17);
            tree.add(8);
            tree.add(15);
            tree.add(5);
            tree.add(40);
            tree.add(18);
            tree.add(80);
                    
        } catch (Exception ignored) {
        }
        tree.prettyPrint();   // вывод дерева в консоль

        System.out.println();
        System.out.println();
        System.out.println();

        final RedBlackTree tree2 = new RedBlackTree();  // создание дерева и заполнение значениями, которые были на семинаре
        try {
                
            tree2.add(1);
            tree2.add(9);
            tree2.add(2);
            tree2.add(8);
            tree2.add(3);
            tree2.add(7);
            tree2.add(4);
            tree2.add(6);
            tree2.add(5);
            tree2.add(10);
            tree2.add(20);
            tree2.add(15);
            tree2.add(17);
                    
        } catch (Exception ignored) {
        }
        tree2.prettyPrint();    // вывод дерева в консоль   
    }     
}