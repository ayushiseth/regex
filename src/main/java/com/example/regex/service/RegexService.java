package com.example.regex.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.regex.entity.InputDto;
import com.example.regex.entity.OutputDto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

@Service
public class RegexService {

    @PostMapping
    public 
    OutputDto validate(@RequestBody InputDto inputDto) {
    	OutputDto o= new OutputDto();
    	
    	try {
    	 Pattern p = Pattern.compile(inputDto.getRegex());
         boolean found = p.matcher(inputDto.getTextBody()).lookingAt();
         if(found) {
         Matcher m = p.matcher(inputDto.getTextBody());
         if (m.find( )) {
            o.setMatch(m.group(0));
         }
    	o.setError("false");
    	}
         }
    	catch(PatternSyntaxException p) {
    		o.setError("true");
    	}
        return o;
    }

}
