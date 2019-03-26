package abcTest.mumberTest.collection;

import charactor.Hero;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.List;

/***
 *@Author:BHR
 *@Description:
 *@Date:Created in 13:34 2019/3/26
 *@Modified By:
 */
public class BinaryTree {
    public BinaryTree leftBT;
    public BinaryTree rightBT;
    public Integer value;

    public BinaryTree getLeftBT() {
        return leftBT;
    }

    public void setLeftBT(BinaryTree leftBT) {
        this.leftBT = leftBT;
    }

    public BinaryTree getRightBT() {
        return rightBT;
    }

    public void setRightBT(BinaryTree rightBT) {
        this.rightBT = rightBT;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void add(Integer v) {
        if (value == null) {
            value = v;
        } else if (value >= v) {
            if (leftBT == null) {
                leftBT = new BinaryTree();
            }
            leftBT.add(v);
        } else {
            if (rightBT == null) {
                rightBT = new BinaryTree();
            }
            rightBT.add(v);
        }


    }

    public List<Integer> values() {
        List<Integer> values = new ArrayList<>();
        if (null != leftBT) {
            values.addAll(leftBT.values());
        }
        values.add(value);
        if (null != rightBT) {
            values.addAll(rightBT.values());
        }
        return values;
    }

    public static void main(String[] args) {
//        ArrayListTest<Hero> binaryTreeArrayListTest = new ArrayListTest<>();
//        ArrayList<BinaryTree> binaryTrees = new ArrayList<>();
//        BinaryTree[] binaryTrees1 = new BinaryTree[10];
        //对象数组初始化
        BinaryTree binaryTree = new BinaryTree();

        Integer[] integers = {67, 730, 39, 31, 32, 64, 54, 44, 44, 33};
        for (int i = 0; i < 10; i++) {
//            binaryTrees.get(i).setValue(integers[i]);
//            System.out.println(integers[i]);
//            binaryTrees1[i] = new BinaryTree();
//            binaryTrees1[i].setValue(integers[i]);
//            System.out.println(binaryTrees1[i]);
//            binaryTrees1[i].setValue(1);
            binaryTree.add(integers[i]);

        }
//        binaryTree.values().get(0);
//        System.out.println(binaryTrees1[1]);
        System.out.println(binaryTree.values());
        System.out.println("-------二叉树排序Test---------");
//        compare(binaryTrees1[0], binaryTrees1[1]);
//        System.out.println(binaryTrees1[0].getRightBT().getValue());

    }


}
