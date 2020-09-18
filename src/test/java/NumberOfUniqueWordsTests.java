import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfUniqueWordsTests {

    @Test
    public void getNumberOfUniqueWords_WhenAllWordsAreUnique_ShouldReturnNumberOfWords(){
        // Arrange
        NumberOfUniqueWords sut = new NumberOfUniqueWords();

        // Act
        String input = "This is a test.";
        int result = sut.getNumberOfUniqueWords(input);

        // Verify
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void getNumberOfUniqueWords_WhenAllWordsAreNotUnique_ShouldReturnNumberOfUniqueWords(){
        // Arrange
        NumberOfUniqueWords sut = new NumberOfUniqueWords();

        // Act
        String input = "In the future, everybody will be coding for Trendyol for fifteen minutes.";
        int result = sut.getNumberOfUniqueWords(input);

        // Verify
        assertThat(result).isEqualTo(11);
    }

    @Test
    public void getNumberOfUniqueWords_WhenAllWordsAreNotUniqueAndHasSpecialChars_ShouldReturnNumberOfUniqueWords(){
        // Arrange
        NumberOfUniqueWords sut = new NumberOfUniqueWords();

        // Act
        String input = "This is a test, and a good test! WTF!?#%";
        int result = sut.getNumberOfUniqueWords(input);

        // Verify
        assertThat(result).isEqualTo(7);
    }

    @Test
    public void getNumberOfUniqueWords_WhenAllWordsAreNotUniqueAndHasApostrophes_ShouldReturnNumberOfUniqueWords(){
        // Arrange
        NumberOfUniqueWords sut = new NumberOfUniqueWords();

        // Act
        String input = "Having great time with Islandman's Boiler Room Record!";
        int result = sut.getNumberOfUniqueWords(input);

        // Verify
        assertThat(result).isEqualTo(8);
    }
}
