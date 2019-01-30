# Background

For a long Jenkins pipeline, the only way to find out how long each build cycle takes. This is a script to 
address this issue by taking the XML feed and producing build time by parsing the info.  
 

# Usage

Install dependencies `brew install scala sbt`

Get build report from Jenkins View RSS via `https://<jenkins>/view/<view>/rssLatest`

Put the XML data in `src/main/resources/latest.xml`

Run `sbt run`
