import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class NumberOfUniqueWordsTests {

    @Test
    public void getNumberOfUniqueWords_WhenAllWordsUnique_ShouldReturnNumberOfWords(){
        // Arrange
        NumberOfUniqueWords sut = new NumberOfUniqueWords();

        // Act
        String input = "This is a test.";
        int result = sut.getNumberOfUniqueWords(input);

        // Verify
        assertThat(result).isEqualTo(4);
    }


}
