package com.test;

import com.alibaba.fastjson.JSONArray;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("/")
public class DemoController {

    private String s = "{\n" +
            "  \"format\": \"json\",\n" +
            "  \"type\": \"akamai_siem\",\n" +
            "  \"version\": \"1.0\",\n" +
            "  \"attackData\": {\n" +
            "      \"clientIP\": \"52.91.36.10\",\n" +
            "      \"configId\": \"14227\",\n" +
            "      \"policyId\": \"qik1_26545\",\n" +
            "      \"ruleActions\": \"YWxlcnQ%3d%3bYWxlcnQ%3d%3bZGVueQ%3d%3d\",\n" +
            "      \"ruleData\": \"dGVsbmV0LmV4ZQ%3d%3d%3bdGVsbmV0LmV4ZQ%3d%3d%3bVmVjdG9yIFNjb3JlOiAxMCwgREVOWSB0aHJlc2hvbGQ6IDksIEFsZXJ0IFJ1bGVzOiA5NTAwMDI6OTUwMDA2LCBEZW55IFJ1bGU6ICwgTGFzdCBNYXRjaGVkIE1lc3NhZ2U6IFN5c3RlbSBDb21tYW5kIEluamVjdGlvbg%3d%3d\",\n" +
            "      \"ruleMessages\": \"U3lzdGVtIENvbW1hbmQgQWNjZXNz%3bU3lzdGVtIENvbW1hbmQgSW5qZWN0aW9u%3bQW5vbWFseSBTY29yZSBFeGNlZWRlZCBmb3IgQ29tbWFuZCBJbmplY3Rpb24%3d\",\n" +
            "      \"ruleSelectors\": \"QVJHUzpvcHRpb24%3d%3bQVJHUzpvcHRpb24%3d%3b\",\n" +
            "      \"ruleTags\": \"T1dBU1BfQ1JTL1dFQl9BVFRBQ0svRklMRV9JTkpFQ1RJT04%3d%3bT1dBU1BfQ1JTL1dFQl9BVFRBQ0svQ09NTUFORF9JTkpFQ1RJT04%3d%3bQUtBTUFJL1BPTElDWS9DTURfSU5KRUNUSU9OX0FOT01BTFk%3d\",\n" +
            "      \"ruleVersions\": \"NA%3d%3d%3bNA%3d%3d%3bMQ%3d%3d\",\n" +
            "      \"rules\": \"OTUwMDAy%3bOTUwMDA2%3bQ01ELUlOSkVDVElPTi1BTk9NQUxZ\"\n" +
            "  },\n" +
            "  \"geo\": {\n" +
            "      \"asn\": \"14618\",\n" +
            "      \"city\": \"ASHBURN\",\n" +
            "      \"continent\": \"288\",\n" +
            "      \"country\": \"US\",\n" +
            "      \"regionCode\": \"VA\"\n" +
            "  },\n" +
            "  \"httpMessage\": {\n" +
            "      \"bytes\": \"266\",\n" +
            "      \"host\": \"www.hmapi.com\",\n" +
            "      \"method\": \"GET\",\n" +
            "      \"path\": \"/\",\n" +
            "      \"port\": \"80\",\n" +
            "      \"protocol\": \"HTTP/1.1\",\n" +
            "      \"query\": \"option=com_jce%20telnet.exe\",\n" +
            "      \"requestHeaders\": \"User-Agent%3a%20BOT%2f0.1%20(BOT%20for%20JCE)%0d%0aAccept%3a%20text%2fhtml,application%2fxhtml+xml,application%2fxml%3bq%3d0.9,*%2f*%3bq%3d0.8%0d%0auniqueID%3a%20CR_H8%0d%0aAccept-Language%3a%20en-US,en%3bq%3d0.5%0d%0aAccept-Encoding%3a%20gzip,%20deflate%0d%0aConnection%3a%20keep-alive%0d%0aHost%3a%20www.hmapi.com%0d%0aContent-Length%3a%200%0d%0a\",\n" +
            "      \"requestId\": \"1158db1758e37bfe67b7c09\",\n" +
            "      \"responseHeaders\": \"Server%3a%20AkamaiGHost%0d%0aMime-Version%3a%201.0%0d%0aContent-Type%3a%20text%2fhtml%0d%0aContent-Length%3a%20266%0d%0aExpires%3a%20Tue,%2004%20Apr%202017%2010%3a57%3a02%20GMT%0d%0aDate%3a%20Tue,%2004%20Apr%202017%2010%3a57%3a02%20GMT%0d%0aConnection%3a%20close%0d%0aSet-Cookie%3a%20ak_bmsc%3dAFE4B6D8CEEDBD286FB10F37AC7B256617DB580D417F0000FE7BE3580429E23D%7epluPrgNmaBdJqOLZFwxqQLSkGGMy4zGMNXrpRIc1Md4qtsDfgjLCojg1hs2HC8JqaaB97QwQRR3YS1ulk+6e9Dbto0YASJAM909Ujbo6Qfyh1XpG0MniBzVbPMUV8oKhBLLPVSNCp0xXMnH8iXGZUHlUsHqWONt3+EGSbWUU320h4GKiGCJkig5r+hc6V1pi3tt7u3LglG3DloEilchdo8D7iu4lrvvAEzyYQI8Hao8M0%3d%3b%20expires%3dTue,%2004%20Apr%202017%2012%3a57%3a02%20GMT%3b%20max-age%3d7200%3b%20path%3d%2f%3b%20domain%3d.hmapi.com%3b%20HttpOnly%0d%0a\",\n" +
            "      \"start\": \"1491303422\",\n" +
            "      \"status\": \"200\"\n" +
            "  }\n" +
            "}";
    private JSONArray array = new JSONArray();

    @PostConstruct
    public void init() {
        System.out.println("========PostConstruct=");
        for (int i = 0; i < 600000; i++) {
            array.add(s);
        }
    }

    @GetMapping("/demo")
    public JSONArray zabbixDemo() {

        System.out.println("=============");
        //System.out.println(JSONArray.toJSONString(array).getBytes(StandardCharsets.UTF_8).length/1024/1024);
        return array;
    }

}
