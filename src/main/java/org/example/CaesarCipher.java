package org.example;

public class CaesarCipher {

    public String calculateCipher(String input) {
        // String variable
        // int variable
        // forEach iteration (input.toCharArray())
        // if the character is alphabets
        // sum += key + 13
        // if isUpperCase (sum > 90) or isLowerCase (sum > 122)
        // if the sum > 122; sum - 26; String Variable += sum.toString()
        int newASCIIValue = 0;
        StringBuilder cipher = new StringBuilder();
        for(char letter : input.toCharArray()){
            newASCIIValue = 0;
            if(Character.isAlphabetic(letter)) {
                newASCIIValue += letter +13;
                if (Character.isUpperCase(letter)) {
                    if(newASCIIValue > 90){
                        newASCIIValue -= 26;
                    }
                }
                else{
                    if(newASCIIValue > 122){
                        newASCIIValue -= 26;
                    }
                }
                cipher.append((char) newASCIIValue);
            }else{
            cipher.append(letter);}
        }
        return cipher.toString();
    }
}
