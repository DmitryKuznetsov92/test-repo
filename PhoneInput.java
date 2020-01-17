class PhoneInput {
    public static void main (String args[])
            throws java.io.IOException {
        
        // phone buttons massive
        char alphabet[][] = {
            {' '},
            {'1'},
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q', 'r', 's'},
            {'t', 'u', 'v'},
            {'w', 'x', 'y', 'z'}
        };
        
        // origin dictionary
        String dic[] = { "word", "java", "string", "apache", "beans", "netbeans", "doll", "enkk"};
        
        // numeric dictionary
        StringBuffer numDic[] = new StringBuffer[dic.length];
        
        // dictionary conversion
        for (int i=0; i < dic.length; i++) {
            numDic[i] = new StringBuffer();
            for (int j=0; j < dic[i].length(); j++) {
                
                for (int k=0; k < 10; k++) {
                    
                    for (int l=0; l < alphabet[k].length; l++) {
                    
                        if (dic[i].charAt(j) == alphabet[k][l]) {
                            
                            String tmpStringForChar = String.valueOf(k);
                            numDic[i].append(tmpStringForChar.charAt(0));
                        }
                    }
                }
            }
        }
        
        // numerical string input 
        char nums;
        StringBuffer numberWord = new StringBuffer();
        
        System.out.println("Input number:");
        
        do {
            nums = (char) System.in.read ();
            numberWord.append(nums);
        } while (nums != '.');
        
        numberWord.delete (numberWord.length()-1, numberWord.length());
                
        // search in dictionary
        System.out.println("Did you mean:");
        String str1 = new String (numberWord.toString());
        for (int i = 0; i < numDic.length; i++) {
            String str2 = new String (numDic[i].toString());
            if (str1.equals(str2)) {
                System.out.println (dic[i]);
            }
        }
    }
}