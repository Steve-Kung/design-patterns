package factory;

import button.Button;
import button.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
// 工厂1
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
