package com.arshdeep.demo.Services;

import com.arshdeep.demo.Dao.TestRepository;
import com.arshdeep.demo.Entities.Severity;
import com.arshdeep.demo.Models.BaseMetricV2;
import com.arshdeep.demo.Models.CVE_Items;
import com.arshdeep.demo.Models.Impact;
import com.arshdeep.demo.Models.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class TestServices {

    @Autowired
    private TestRepository testRepository;

    @Autowired
    private Model modelInfo;


    public List<Severity> addSeverity(Model model) {
        List<Severity> severities = new ArrayList<>();
        String publishedDate = "";
        List<CVE_Items> cveList = model.getCve_items();
        for (CVE_Items cv : cveList) {
            Severity severity = new Severity();
            publishedDate = cv.getPublishedDate();
            severity.setPublishedDate(cv.getPublishedDate());
            String[] year = publishedDate.split("-");
            severity.setPublishedDate(year[0]);
            Impact impact = cv.getImpact();
            if (!ObjectUtils.isEmpty(impact)) {
                BaseMetricV2 baseMetricV2 = impact.getBaseMetricV2();
                if (!ObjectUtils.isEmpty(baseMetricV2)) {
                    severity.setSeverity(baseMetricV2.getSeverity());
                }
            }
            severities.add(severity);
        }
        testRepository.saveAll(severities);


        return severities;

    }



    public Map getSeverity() {

        List<Severity> severities = testRepository.findAll();
        Map<String, List<Severity>> modules =
                severities
                        .stream()
                        .collect(Collectors.groupingBy(Severity::getPublishedDate));

        Map<String, Object> mainMap = new HashMap<>();


        Map<String, Long> fifteenMap = new HashMap<>();
        fifteenMap.put("medium", severities
                .stream()
                .filter(x -> "2015".equalsIgnoreCase(x.getPublishedDate()) && "MEDIUM".equalsIgnoreCase(x.getSeverity()))
                .count());
        fifteenMap.put("low", severities
                .stream()
                .filter(x -> "2015".equalsIgnoreCase(x.getPublishedDate()) && "LOW".equalsIgnoreCase(x.getSeverity()))
                .count());
        fifteenMap.put("high", severities
                .stream()
                .filter(x -> "2015".equalsIgnoreCase(x.getPublishedDate()) && "HIGH".equalsIgnoreCase(x.getSeverity()))
                .count());
        fifteenMap.put("critical", severities
                .stream()
                .filter(x -> "2015".equalsIgnoreCase(x.getPublishedDate()) && "CRITICAL".equalsIgnoreCase(x.getSeverity()))
                .count());

        mainMap.put("2015", fifteenMap);


        Map<String, Long> sixteenMap = new HashMap<>();
        sixteenMap.put("medium", severities
                .stream()
                .filter(x -> "2016".equalsIgnoreCase(x.getPublishedDate()) && "MEDIUM".equalsIgnoreCase(x.getSeverity()))
                .count());
        sixteenMap.put("low", severities
                .stream()
                .filter(x -> "2016".equalsIgnoreCase(x.getPublishedDate()) && "LOW".equalsIgnoreCase(x.getSeverity()))
                .count());
        sixteenMap.put("high", severities
                .stream()
                .filter(x -> "2016".equalsIgnoreCase(x.getPublishedDate()) && "HIGH".equalsIgnoreCase(x.getSeverity()))
                .count());
        sixteenMap.put("critical", severities
                .stream()
                .filter(x -> "2016".equalsIgnoreCase(x.getPublishedDate()) && "CRITICAL".equalsIgnoreCase(x.getSeverity()))
                .count());

        mainMap.put("2016", sixteenMap);


        Map<String, Long> seventeenMap = new HashMap<>();
        seventeenMap.put("medium", severities
                .stream()
                .filter(x -> "2017".equalsIgnoreCase(x.getPublishedDate()) && "MEDIUM".equalsIgnoreCase(x.getSeverity()))
                .count());
        seventeenMap.put("low", severities
                .stream()
                .filter(x -> "2017".equalsIgnoreCase(x.getPublishedDate()) && "LOW".equalsIgnoreCase(x.getSeverity()))
                .count());
        seventeenMap.put("high", severities
                .stream()
                .filter(x -> "2017".equalsIgnoreCase(x.getPublishedDate()) && "HIGH".equalsIgnoreCase(x.getSeverity()))
                .count());
        seventeenMap.put("critical", severities
                .stream()
                .filter(x -> "2017".equalsIgnoreCase(x.getPublishedDate()) && "CRITICAL".equalsIgnoreCase(x.getSeverity()))
                .count());

        mainMap.put("2017", seventeenMap);


        Map<String, Long> eighteenMap = new HashMap<>();
        eighteenMap.put("medium", severities
                .stream()
                .filter(x -> "2018".equalsIgnoreCase(x.getPublishedDate()) && "MEDIUM".equalsIgnoreCase(x.getSeverity()))
                .count());
        eighteenMap.put("low", severities
                .stream()
                .filter(x -> "2018".equalsIgnoreCase(x.getPublishedDate()) && "LOW".equalsIgnoreCase(x.getSeverity()))
                .count());
        eighteenMap.put("high", severities
                .stream()
                .filter(x -> "2018".equalsIgnoreCase(x.getPublishedDate()) && "HIGH".equalsIgnoreCase(x.getSeverity()))
                .count());
        eighteenMap.put("critical", severities
                .stream()
                .filter(x -> "2018".equalsIgnoreCase(x.getPublishedDate()) && "CRITICAL".equalsIgnoreCase(x.getSeverity()))
                .count());

        mainMap.put("2018", eighteenMap);


        Map<String, Long> nineteenMap = new HashMap<>();
        nineteenMap.put("medium", severities
                .stream()
                .filter(x -> "2019".equalsIgnoreCase(x.getPublishedDate()) && "MEDIUM".equalsIgnoreCase(x.getSeverity()))
                .count());
        nineteenMap.put("low", severities
                .stream()
                .filter(x -> "2019".equalsIgnoreCase(x.getPublishedDate()) && "LOW".equalsIgnoreCase(x.getSeverity()))
                .count());
        nineteenMap.put("high", severities
                .stream()
                .filter(x -> "2019".equalsIgnoreCase(x.getPublishedDate()) && "HIGH".equalsIgnoreCase(x.getSeverity()))
                .count());
        nineteenMap.put("critical", severities
                .stream()
                .filter(x -> "2019".equalsIgnoreCase(x.getPublishedDate()) && "CRITICAL".equalsIgnoreCase(x.getSeverity()))
                .count());

        mainMap.put("2019", nineteenMap);


        Map<String, Long> twentyMap = new HashMap<>();
        twentyMap.put("medium", severities
                .stream()
                .filter(x -> "2020".equalsIgnoreCase(x.getPublishedDate()) && "MEDIUM".equalsIgnoreCase(x.getSeverity()))
                .count());
        twentyMap.put("low", severities
                .stream()
                .filter(x -> "2020".equalsIgnoreCase(x.getPublishedDate()) && "LOW".equalsIgnoreCase(x.getSeverity()))
                .count());
        twentyMap.put("high", severities
                .stream()
                .filter(x -> "2020".equalsIgnoreCase(x.getPublishedDate()) && "HIGH".equalsIgnoreCase(x.getSeverity()))
                .count());
        twentyMap.put("critical", severities
                .stream()
                .filter(x -> "2020".equalsIgnoreCase(x.getPublishedDate()) && "CRITICAL".equalsIgnoreCase(x.getSeverity()))
                .count());

        mainMap.put("2020", twentyMap);


        return mainMap;
    }


}
