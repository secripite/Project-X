import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Pattern;

public class HelloBiodome08 {
    private static final String[] DICTIONARY = { "hello", "where", "this", "biodome", "help", "tree", "new", "is", "problem", "please",
            "need", "we", "isn’t", "there", "a", "your", "any", "thanks", "the", "for", "solution", "can", "?","you"};
    private static final String[] DICTIONARY_KOR = {"안녕하세요", "새로운", "나무를", "발견했습니다", "신속한", "지원", "감사합니다", "당신의", "신속한", "도움이", "필요합니다"};
    public static void main(String[] args) {
        try {
            String no_space_sent = new String(args[0]);
            if (no_space_sent.charAt(no_space_sent.length()-1) != '.' && no_space_sent.charAt(no_space_sent.length()-1) != '?' )
                no_space_sent += ".";
            StringBuilder result = processMessage(no_space_sent);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("재입력 해주십시오.");
        }
    }

    private static StringBuilder processMessage(String message) {
        StringBuilder sentence = new StringBuilder();
        int startIndex = 0;
        int endIndex = 1;
        int flag = 0, flag_index = 0;
        int tempSIndex, tempEIndex;
        String temp_word = new String();
        String temping_word = new String();
        String flag_word = new String();

        while (true) {
            try{
                String word = message.substring(startIndex, endIndex);

                if (isWordInDictionary(word, 0) == 2) {
                    tempSIndex = startIndex;
                    tempEIndex = endIndex;
                    while (true) {
                        temp_word = message.substring(tempSIndex, tempEIndex);
                        temping_word = temp_word.substring(0,temp_word.length()-1);
                        if (isWordInDictionary(temp_word, 0) == 2) {
                            tempEIndex++;
                            continue;
                        }
                        else if (isWordInDictionary(temping_word , 1) == 1) {
                            endIndex = tempEIndex-1;
                            word = message.substring(startIndex, endIndex);
                            break;
                        }
                        tempEIndex++;
                        if (tempEIndex > message.length()) {
                            break;
                        }
                    }
                }
                if (isWordInDictionary(word, 1) == 1 && flag == 0) {
                    sentence.append(word).append(" ");
                    startIndex = endIndex;
                }
                else if (isWordInDictionary(word, 1) == 1 && flag == 1) {
                    flag_word = message.substring(flag_index, startIndex);
                    sentence.append(flag_word).append(" ").append(word).append(" ");
                    startIndex = endIndex;
                    flag = 0;
                }
                endIndex++;

                if(endIndex > message.length()){
                    if(flag == 0)
                        flag_index = startIndex;
                    startIndex = startIndex + 1;
                    endIndex = startIndex + 1;
                    flag = 1;
                }
            }
            catch (Exception e){
                sentence.delete(sentence.length()-1,sentence.length());
                sentence.append(message.charAt(message.length()-1));
                return formatSentence(sentence);
            }
        }
    }

    private static int isWordInDictionary(String word, int flag) {
        if (Pattern.matches("^[a-zA-Z]*$", word)) {
            Arrays.sort(DICTIONARY, Comparator.comparing(String::length).reversed());
            for (String dictWord : DICTIONARY) {
                if (dictWord.startsWith(word) && flag == 0) {
                    return 2;
                }
                if (dictWord.equals(word) && flag == 1) {
                    return 1;
                }
            }
            return 0;
        }
        else {
            System.out.println("Bonus");
            Arrays.sort(DICTIONARY_KOR, Comparator.comparing(String::length).reversed());
            for (String dictWord : DICTIONARY_KOR) {
                if (dictWord.startsWith(word) && flag == 0) {
                    return 2;
                }
                if (dictWord.equals(word) && flag == 1) {
                    return 1;
                }
            }
            return 0;
        }
    }

    public static StringBuilder formatSentence(StringBuilder sentence) {
        if (sentence.charAt(sentence.length() - 1) == '?') {
            return sentence;
        }
        else if (sentence.charAt(sentence.length() - 1) == '.') {
            return sentence;
        }
        else
        {
            sentence.deleteCharAt(sentence.length()-1);
            return sentence.append(".");
        }

    }
}
