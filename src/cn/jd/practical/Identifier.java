package cn.jd.practical;

import java.util.Scanner;

public class Identifier {
        private static String[] keywords;
        private String id;
        static {
            keywords = new String[] {
						"int", "float", "double", "char", "long",
                     "unsigned", "signed", "if", "while", "do",
                     "for", "continue", "break", "switch", "return",
                      "else", "auto", "static", "register", "extern",
                      "case", "default", "enum", "goto", "short",
                      "sizeof", "struct", "typedef", "union", "void",
                      "const", "volatile"
                    };
        }

        public Identifier() {
            this("");
        }

        public Identifier(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }

        public void setId(String value){
			id = value;
        }

        public boolean IsIdentifier() { // 判是否为标识符
        	char s=id.charAt(0);
        	for(int i = 0;i<keywords.length;i++) {
        	if(keywords[i].equals(id)) {
        		return false;
        	}
        	}
        	if(s=='_'||((s>='a'&&s<='z')||(s>='A'&&s<='Z'))) 
        		return true;
        	else
        		return false;
        }
        	
        @SuppressWarnings("unused")
		private static boolean IsLetter(char ch) { // 判字母
            if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            	return true;
            else
            	return false;
        }

        @SuppressWarnings("unused")
		private static boolean IsDigit(char ch) { // 判数字
        	if(ch>='0'&&ch<='9')
            	return true;
            else
            	return false;

        }

        public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner reader = new Scanner(System.in);
			System.out.print("输入C语言标识符：");
			String id = reader.next();
			Identifier identifier = new Identifier(id);

			if (identifier.IsIdentifier()) {
				System.out.println("合法");
			} else {
				System.out.println("非法");
			}
		}
    }