package factory;

import button.Button;

/**
 * Base factory class. Note that "factory" is merely a role for the class. It
 * should have some core business logic which needs different products to be
 * created.
 */
// 抽象工厂
public abstract class Dialog {
    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();

    public void renderWindow() {
        // ... other code ...

        Button okButton = createButton();
        okButton.render();
    }
}
