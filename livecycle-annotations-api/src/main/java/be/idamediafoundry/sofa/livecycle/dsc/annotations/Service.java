package be.idamediafoundry.sofa.livecycle.dsc.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Marks a class as being a service to be included as custom component. Only
 * classes annotated with this annotation will be included as services!
 * 
 * @author Mike Seghers
 * 
 */
@Target(ElementType.TYPE)
public @interface Service {
	/**
	 * The small icon that should be used for this service. The actual file
	 * should be a resource of the project, as it must be for custom component
	 * icons in general. The icon should ideally be 16x16 pixels.
	 */
	String smallIcon() default "";

	/**
	 * The large icon that should be used for this service. The actual file
	 * should be a resource of the project, as it must be for custom component
	 * icons in general. The icon should ideally be 100x100 pixels.
	 */
	String largeIcon() default "";

	/**
	 * Overrides the configured component version for the specific service class.
	 */
	Version version() default @Version();
}
