public List<Integer> flatten(List<NestedInteger> nestedList) {
    List<Integer> rst = new ArrayList<Integer>();
    for (NestedInteger nestedInteger : nestedList) {
        if (nestedInteger.isInteger())
            rst.add(nestedInteger.getInteger());
        else
            rst.addAll(flatten(nestedInteger.getList())); // 这里要用addAll方法
    }
    return rst;
}
