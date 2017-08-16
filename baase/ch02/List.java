public class List{

	BinTree listAsTree;

	public static final List nil = makeNil();

	private static List makeNil(){
		List newL = new List();
		newL.listAsTree = BinTree.nil;
		return newL;
	}

	public static List rest(List aList){
	List newL = new List();
	newL.listAsTree = BinTree.rightSubtree(aList.listAsTree);
	return newL;
	}

	public static List cons(Object newElement, List oldList{
	List newL = new List();
	BinTree oldTree;
	if (oldList == List.nil)
		oldTree = BinTree.nil
	else
		oldTree = oldList.listAsTree;
	newL.listAsTree = BinTree.buildTree(newElement, BinTree.nil, oldTree);

	return newL;
	}
}
