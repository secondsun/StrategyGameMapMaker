package net.saga.console.strategygamemapmaker.util;

@FunctionalInterface
public interface PropertyTransformer<T> {
    
    /**
     * This will turn a string property into a object
     * 
     * @param source the stringified object
     * @return the property as an object
     * @throws ValidationException if the value is not valid
     */
    public T transform(String source) throws ValidationException;
    
}
