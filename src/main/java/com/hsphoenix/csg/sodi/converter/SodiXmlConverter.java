package com.hsphoenix.csg.sodi.converter;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hsphoenix.csg.sodi.Msg;

/**
 * @author Yuvraj Dhiman (Yuvraj.Dhiman@.biz)
 */
public class SodiXmlConverter {

	// Converts a list of XML strings to a list of JSONObjects
	public List<JSONObject> toJson(List<String> xmls) throws JsonProcessingException, JAXBException {
		validateXmlList(xmls);
		List<JSONObject> jsonList = new ArrayList<>();
		for (String xml : xmls) {
			jsonList.add(toJson(xml));
		}
		return jsonList;
	}

	// Converts a single XML string to JSONObject
	public JSONObject toJson(String xml) throws JAXBException, JsonProcessingException {
		validateXmlString(xml);
		Msg msg = convert(xml);

		ObjectMapper mapper = new ObjectMapper();
		String jsonString = mapper.writeValueAsString(msg);

		return new JSONObject(jsonString);
	}

	// Converts a list of XML strings to a list of Msg objects
	public List<Msg> convert(List<String> xmls) throws JAXBException {
		validateXmlList(xmls);
		List<Msg> msgList = new ArrayList<>();
		for (String xml : xmls) {
			msgList.add(convert(xml));
		}
		return msgList;
	}

	// Converts a single XML string to a Msg object
	public Msg convert(String xml) throws JAXBException {
		validateXmlString(xml);
		JAXBContext jaxbContext = JAXBContext.newInstance(Msg.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		return (Msg) unmarshaller.unmarshal(new StringReader(xml));
	}

	// Validates the XML list, throws an exception if null or empty
	private void validateXmlList(List<String> xmls) {
		if (xmls == null || xmls.isEmpty()) {
			throw new IllegalArgumentException("The XML list cannot be null or empty");
		}
	}

	// Validates a single XML string, throws an exception if null or empty
	private void validateXmlString(String xml) {
		if (xml == null || xml.isEmpty()) {
			throw new IllegalArgumentException("The XML string cannot be null or empty");
		}
	}
}
