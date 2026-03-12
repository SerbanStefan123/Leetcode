public String longestCommonPrefix(String[] strs) {
        int j=0,i=1,ok=0,max=999999,save=0;
        String same="";
        for (i=0;i<strs.length;i++) {
            if (strs[i].length()<max) {
                max=strs[i].length();
                save=i;
            }
        }
        i=0;
        while(j<strs[save].length()){
            while(i<strs.length-1) {
                if (strs[i].charAt(j) != strs[i+1].charAt(j))
                    ok=1;
                i++;
            }
            if (ok==0)
                same += strs[0].charAt(j);
            else
                j=strs[save].length()
            i=0;
            ok=0;
            j++;
        }
        return same;
    }