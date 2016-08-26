	public int strStr(String source, String target) {
	    //write your code here
		if (target == null || source == null || source.length() < target.length())
			return -1;
		if (target.length() == 0)
			return 0;
		int flag = 0;
		for (int i = 0; i < source.length(); i++) {
			if (target.charAt(0) == source.charAt(i)) {
			    if (source.length()-i < target.length())
			        return -1;
				flag = 1;
				for (int j = 1, k = i+1; j < target.length() && k < source.length(); j++, k++) {
	//						System.out.println(target.charAt(j));
	//						System.out.println(source.charAt(k));
					if (target.charAt(j) != source.charAt(k)) {
						flag = 0;
						break;
					}
				}
				if (flag == 1)
					return i;
				else
					continue;
			}
		}
		return -1;
	}
