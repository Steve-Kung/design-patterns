package factory;

import button.Button;
import button.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
// 工厂2
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
