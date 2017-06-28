package com.repgen.reportTemplates;

public class dump1 {
	/*
	public boolean createReport(String reportName, List dataSetNames) {
	     try {
	         DesignConfig dconfig = new DesignConfig();
	         DataSetHandle dataSetHandleToUse = null;
	         DataSourceHandle dataSourceHandle = null;
	         dconfig.setBIRTHome("C:/BIRT_RUNTIME_2_2/birt-runtime-2_2_0/ReportEngine");
	         IDesignEngine dengine = null;
	      
	         //try to start up the eclipse platform
	         IDesignEngineFactory factory = (IDesignEngineFactory) Platform.createFactoryObject( IDesignEngineFactory.EXTENSION_DESIGN_ENGINE_FACTORY );
	         dengine = factory.createDesignEngine( dconfig );
	      
	         //create a new session, open the library, and retrieve the first data source since it is uniform in our library
	         SessionHandle session = dengine.newSessionHandle( ULocale.ENGLISH ) ;         
	         LibraryHandle design = session.openLibrary("C:/eclipse/GWTBirt/BIRTGwt/src/reports/DataSets.rptlibrary");
	         dataSourceHandle = (DataSourceHandle) design.getDataSources().get(0);
	      
	         //create a new report
	         ReportDesignHandle reportDesign = session.createDesign();
	         reportDesign.getDataSources().add(dataSourceHandle);
	      
	      
	         //find the correct data set based on dateSetName
	         int dataSetCount = 0;
	         for (Iterator dataSetIterator = dataSetNames.iterator(); dataSetIterator.hasNext();)
	         {
	             dataSetCount++;
	             String dataSetName = (String) dataSetIterator.next();
	          
	             for (Iterator i = design.getDataSets().iterator(); i.hasNext(); )
	             {
	                 DataSetHandle dataSetHandle = (DataSetHandle) i.next();
	              
	                 if (dataSetHandle.getName().contains(dataSetName))
	                 {
	                      
	                         dataSetHandleToUse = dataSetHandle;
	                         dataSetHandleToUse.setName(dataSetHandle.getName());
	                 }
	             }
	          
	             //Add the current data set to the report design
	             boolean hasDataSetAlready = false;
	             for (Iterator i = reportDesign.getDataSets().iterator(); i.hasNext();)
	             {
	                 DataSetHandle dataSetInReport = (DataSetHandle) i.next();
	              
	                 if (dataSetInReport.getName().equalsIgnoreCase(dataSetHandleToUse.getName()))
	                 {
	                     hasDataSetAlready = true;
	                 }
	             }
	             if (hasDataSetAlready == false)
	                 reportDesign.getDataSets().add(dataSetHandleToUse);
	          
	             //get the columns from the selected dataset
	             List columnList = new ArrayList();
	             for (Iterator i = dataSetHandleToUse.getCachedMetaDataHandle().getResultSet().iterator(); i.hasNext(); )
	             {
	                 ResultSetColumnHandle colInfo = (ResultSetColumnHandle)i.next();
	              
	                 columnList.add(colInfo.getColumnName());
	             }
	          
	             //create new table, set the data set
	             TableHandle reportTable = reportDesign.getElementFactory().newTableItem("testTable" + dataSetHandleToUse.getName(), columnList.size());
	             reportTable.setWidth("100%");
	             reportTable.setDataSet(dataSetHandleToUse);
	          
	             //create a new detail row and add to the report
	             RowHandle detailRow = (RowHandle) reportTable.getDetail().get(0);
	             int x = 0; //used to mark current column position
	          
	             //go through column list and create a new column binding, otherwise data will not be populated into the report
	             //Then add a new column to our row
	             for (Iterator i = columnList.iterator(); i.hasNext();)
	             {
	                 String columnName = (String) i.next();
	              
	                 ComputedColumn computedColumn = StructureFactory.createComputedColumn();
	                 computedColumn.setName(columnName);
	                 computedColumn.setExpression("dataSetRow[\"" + columnName +"\"]");
	                 PropertyHandle computedSet = reportTable.getColumnBindings( );
	                 reportTable.getColumnBindings().addItem(computedColumn);
	              
	                 //add new data item and cell
	                 DataItemHandle data = reportDesign.getElementFactory().newDataItem(columnName);
	                 data.setResultSetColumn(columnName);
	                 CellHandle cell = (CellHandle)detailRow.getCells().get(x);
	                 cell.getContent().add(data);
	                 x++; //advance position
	             }
	                  
	             //add the table to my report
	             reportDesign.getBody().add(reportTable);
	         } 
	         //set my initial properties for the new report
	         reportDesign.setDisplayName(reportName);
	         reportDesign.setDescription(reportName);
	         reportDesign.setIconFile("/templates/blank_report.gif");
	         reportDesign.setFileName("C:/eclipse/GWTBirt/BIRTGwt/src/reports/" + reportName + ".rptdesign");
	         reportDesign.setDefaultUnits("in");
	         reportDesign.setProperty("comments", reportName);
	         reportDesign.setProperty(IReportRunnable.TITLE, reportName);
	      
	         //save report design
	         reportDesign.saveAs("C:/eclipse/GWTBirt/BIRTGwt/src/reports/" + reportName + ".rptdesign");
	      
	         return true;
	     } catch (ContentException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	     } catch (NameException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	     } catch (DesignFileException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	     } catch (SemanticException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	     } catch (IOException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
*/
}
