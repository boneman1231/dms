DEV:
bower install
	temp dependecy
  	"jQuery": "~2.1.4",
	"angular": "~1.3.14",
	"bootstrap": "~3.3.1",
	"angular-touch": "~1.5.3",    
	"angular-ui-grid": "~3.1.1"

Command:
mvn spring-boot:run

REST:
POST: http://localhost:8080/mapGenHist
	Content-Type:application/json
	{
	  "waferId":"N12345.01",
	  "claimTime":"2016-04-21T13:30:00.000+0000",
	  "part6":"TMXXX",
	  "sortNo":"G",
	  "accessApplication":"MES",
	  "claimUser":"Tim",
	  "claimMemo":"sync"
	}
Get: http://localhost:8080/mapGenHist

