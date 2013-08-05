package be.idamediafoundry.sofa.livecycle.example;

import be.idamediafoundry.sofa.livecycle.dsc.annotations.Version;
import org.apache.commons.lang.StringUtils;

import be.idamediafoundry.sofa.livecycle.dsc.annotations.Operation;
import be.idamediafoundry.sofa.livecycle.dsc.annotations.Service;

/**
 * Example LiveCycle custom component that will be called by the sample of the livecycle-maven-plugin project.
 *
 * @DSC
 * @smallIcon icon_small.png
 * @largeIcon icon_large.png
 */
@Service(largeIcon = "icon_large.png", smallIcon = "icon_small.png", categoryId = "iDAMF", version = @Version(major = 1, minor = 0))
public class ExampleCustomComponent {

    /**
     * A configurable property.
     */
    private String exampleConfigurationProperty;

    /**
     * Capitalizes a String.
     *
     * @param input The String to capitalize, may be null
     * @return The capitalized String, null is input String is null
     *
     * @outputParamName capitalizedString
     */
	@Operation(name = "capitalize", outputName = "capitalizedString", largeIcon = "icon_large.png", smallIcon = "icon_small.png")
    public String capitalize(final String input) {
        return StringUtils.capitalize(input);
    }

    /**
     * Get the example configuration property.
     *
     * @return the example configuration property
     */
    public String getExampleConfigurationProperty() {
        return exampleConfigurationProperty;
    }

    /**
     * Set the example configuration property.
     *
     * @param exampleConfigurationProperty the example configuration property
     *
     * @default exampleValue
     */
    public void setExampleConfigurationProperty(String exampleConfigurationProperty) {
        this.exampleConfigurationProperty = exampleConfigurationProperty;
    }
}
