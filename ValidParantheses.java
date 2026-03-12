public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            String opening = "([{";
            String closing = ")]}";
        for(int i=0;i<s.length();i++){
                if (opening.indexOf(s.charAt(i)) != -1)
                    stack.push(s.charAt(i));
                else if (closing.indexOf(s.charAt(i)) != -1){
                    if(stack.isEmpty())
                        return false;
                    if(stack.peek()!=opening.charAt(closing.indexOf(s.charAt(i)))){
                        return false;
                    }
                    else
                        stack.pop();
                }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }