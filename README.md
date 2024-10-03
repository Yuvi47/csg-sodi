# csg-sodi
 

# Sodi Xml Request Converter

The `SodiXmlConverter` class is designed to handle conversions between XML and JSON objects, as well as converting XML to Java objects (`Msg`). It provides a utility for parsing XML and generating JSON output, and it also includes basic validation for XML input.

## Features
- Convert a list of XML into a list of `JSONObject`.
- Convert a single XML into a `JSONObject`.
- Convert a list of XML into a list of `Msg` objects.
- Convert a single XML into a `Msg` object.
- Input validation for XML and XML lists.

## Usage

### 1. Convert List of XML Strings to List of JSONObjects

You can use the `toJson(List<String> xmls)` method to convert a list of XML into JSON objects.

```java
SodiXmlConverter converter = new SodiXmlConverter();
List<String> xmls = Arrays.asList("<Msg>...</Msg>", "<Msg>...</Msg>");
List<JSONObject> jsonObjects = converter.toJson(xmls);
```

### 2. Convert a Single XML String to JSONObject

To convert a single XML into a `JSONObject`, you can call the `toJson(String xml)` method.

```java
String xml = "<Msg>...</Msg>";
JSONObject jsonObject = converter.toJson(xml);
```

### 3. Convert List of XML Strings to List of Msg Objects

To convert a list of XML into Java `Msg` objects, use the `convert(List<String> xmls)` method.

```java
List<Msg> msgObjects = converter.convert(xmls);
```

### 4. Convert a Single XML String to Msg Object

To convert a single XML into a `Msg` object, use the `convert(String xml)` method.

```java
Msg msg = converter.convert(xml);
```

### Input Validation
- **`validateXmlList(List<String> xmls)`**: Validates that the XML list is not `null` or empty. If validation fails, an `IllegalArgumentException` is thrown.
- **`validateXmlString(String xml)`**: Validates that the XML is not `null` or empty. If validation fails, an `IllegalArgumentException` is thrown.

## Requirements

- **JAXB**: Java Architecture for XML Binding, for converting XML into Java objects.
- **Jackson**: For converting Java objects into JSON format.

Ensure that your `pom.xml` includes dependencies for JAXB and Jackson:

```xml
<dependencies>
    <!-- JAXB -->
    <dependency>
        <groupId>javax.xml.bind</groupId>
        <artifactId>jaxb-api</artifactId>
        <version>2.3.1</version>
    </dependency>
    <dependency>
        <groupId>org.glassfish.jaxb</groupId>
        <artifactId>jaxb-runtime</artifactId>
        <version>2.3.1</version>
    </dependency>
    
    <!-- Jackson -->
    <dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.18.0</version>
    </dependency>

    <!-- JSON Processing -->
    <dependency>
        <groupId>org.json</groupId>
        <artifactId>json</artifactId>
        <version>20201115</version>
    </dependency>
</dependencies>
```

## Error Handling
- **IllegalArgumentException**: Thrown when the input XML or list is `null` or empty.
- **JAXBException**: Thrown when there is an error in the XML unmarshalling process.
- **JsonProcessingException**: Thrown when there is an issue with JSON serialization.

## Developer Information

**Developer**: Yuvraj Dhiman
**GitHub**: [Yuvi47](https://github.com/Yuvi47)  

## License
This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.
