import java.util.Scanner;

class Bst{
    int data;
    Bst low;
    Bst high;
   Bst(int data){
        this.data = data;
    }
}
class Opereations{
    Bst node;
//    Insertion........
    Bst insertion(int data,Bst currentNode ){
        if(currentNode == null){
           currentNode = new Bst(data);
            return currentNode;
        }
        if(data> currentNode.data){
            currentNode.high = insertion(data,currentNode.high);
        }
        else if(data<currentNode.data){
            currentNode.low  = insertion(data,currentNode.low);
        }
        return currentNode;
    }

    void insert(int data){
       node=  insertion(data,node);
    }
    //Insertion End.....
//   ---------------------------------------------
    //Printing Start.....
    void print(){
        printing(node);
    }
    void printing(Bst node){
        if(node != null){
            printing(node.low);
            System.out.println(node.data);
            printing(node.high);
        }
    }
    // Printing End.....
    //SEarching....

    void search(int data){
        String str = search(node,data)?"Found":"Not Found";
        System.out.println(str);
    }
    boolean search(Bst currentNode,int data){
        if(currentNode == null) return false;
        if(currentNode.data == data){
            return true;
        }
        if(currentNode.data>data){
            return search(currentNode.low,data);
        }
       else{
            return  search(currentNode.high,data);
        }
    }
    void max(){
        max(node);
    }
    int  max(Bst currentnode){
        int max = currentnode.data;
        while(currentnode.high != null){
            max = currentnode.data;
            currentnode= currentnode.high;
        }
        return max;
    }
    void  min(){
        min(node);
    }
    int  min(Bst currentnode){
        int min = currentnode.data;
        while(currentnode.low != null){
            min = currentnode.data;
            currentnode= currentnode.low;
        }
        return min;
    }
    void delete(Bst currentNode , Bst ParentNode , Boolean isLeft , int data){
        // Element greater go in right....
        if(data>currentNode.data){
            delete(currentNode.high, currentNode, false , data);
        }
        else if(data<currentNode.data){
            delete(currentNode.low,currentNode , true, data);
        }
        else
        {
            // case-1:-if(left and right both are null)
            if(currentNode.low == null && currentNode.high == null){
                if(isLeft){
                    ParentNode.low = null;
                }
                else
                {
                    ParentNode.high = null;
                }
            }
            // Case2:-
            else if(currentNode.low == null || currentNode.high != null){
                if(isLeft){
                    ParentNode.low = currentNode.high;
                }
                else {
                    ParentNode.high = currentNode.high;
                }
            }
            else if(currentNode.low!= null || currentNode.high == null){
                if(isLeft){
                    ParentNode.low = currentNode.low;
                }
                else
                ParentNode.high = currentNode.low;
            }
            else {
                if (currentNode.low != null && currentNode.high != null) {

                    Bst temp = currentNode;
                    int maxval = this.max(temp.high);
                    temp.data=maxval;
                    delete(temp.low,temp,isLeft,maxval);


                }
            }
        }
    }
}
public class BinarySearchTree {
    public static void main(String[] args) {
        Opereations op =new Opereations();
        Scanner sc = new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("1.Insert Data");
            System.out.println("2.Print Data");
            System.out.println("3.Search Data");
            System.out.println("4.Exit");
            System.out.println("Enter The Choice");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    while (true){
                        System.out.println("Enter the data and -1 for exist");
                        int data = sc.nextInt();
                        if(data == -1){
                            break;
                        }
                        op.insert(data);
                    }
                    break;
                case 2:
                    System.out.println("Print the data");
                    op.print();
                    break;
                case 3:
                    op.search(110);
                case 4:
                    return;
            }
        }


    }
}
