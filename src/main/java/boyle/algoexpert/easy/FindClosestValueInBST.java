package boyle.algoexpert.easy;

public class FindClosestValueInBST {
    /*
      "target": 12,
              "tree": {
        "nodes": [
        {"id": "10", "left": "5", "right": "15", "value": 10},
        {"id": "15", "left": "13", "right": "22", "value": 15},
        {"id": "22", "left": null, "right": null, "value": 22},
        {"id": "13", "left": null, "right": "14", "value": 13},
        {"id": "14", "left": null, "right": null, "value": 14},
        {"id": "5", "left": "2", "right": "5-2", "value": 5},
        {"id": "5-2", "left": null, "right": null, "value": 5},
        {"id": "2", "left": "1", "right": null, "value": 2},
        {"id": "1", "left": null, "right": null, "value": 1}
    ],
        "root": "10"
    }*/


    public static int findClosestValueInBst(BST tree, int target) {
        BST currentNode = tree;
        int closestValue = Integer.MAX_VALUE;

        while (currentNode.equals(null)) {

            if (Math.abs(target - closestValue) > Math.abs(target - currentNode.value)) {
                closestValue = currentNode.value;
            }
            if (target < currentNode.value) {
                currentNode = tree.left;
            }
            if (target > currentNode.value) {
                currentNode = tree.right;
            }
            break;
        }
        return closestValue;
    }


    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}

