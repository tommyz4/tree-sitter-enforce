import io.github.treesitter.jtreesitter.Language;
import io.github.treesitter.jtreesitter.enforce.TreeSitterEnforce;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class TreeSitterEnforceTest {
    @Test
    public void testCanLoadLanguage() {
        assertDoesNotThrow(() -> new Language(TreeSitterEnforce.language()));
    }
}
