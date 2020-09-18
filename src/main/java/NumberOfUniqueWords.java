public class NumberOfUniqueWords {



    public void main(String[] args) {
        getNumberOfUniqueWords("bu bir deneme");
    }

    public int getNumberOfUniqueWords(String input) {
        input = input.replace(".", "").replace(",", " ");
        int numberOfUniqueWords = input.split(" ").length;
        return numberOfUniqueWords;
    }
}
