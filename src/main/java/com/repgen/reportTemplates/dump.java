package com.repgen.reportTemplates;

public class dump {

	/*
	public class DECreateDynamicTable
	{
	    ReportDesignHandle designHandle = null;
	    ElementFactory designFactory = null;
	    StructureFactory structFactory = null;  

	    public static void main( String[] args )
	    {
	        try
	        {
	            DECreateDynamicTable de = new DECreateDynamicTable();
	            ArrayList al = new ArrayList();
	            al.add("USERNAME");
	            al.add("COUNTRY");
	            de.buildReport(al, "From GTM_REPORT_APP_USER" );
	        }
	        catch ( IOException e )
	        {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        catch ( SemanticException e )
	        {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }

	    void buildDataSource( ) throws SemanticException
	    {

	        OdaDataSourceHandle dsHandle = designFactory.newOdaDataSource(
	                "Data Source", "org.eclipse.birt.report.data.oda.jdbc" );
	        dsHandle.setProperty( "odaDriverClass",
	                "oracle.jdbc.driver.OracleDriver" );
	        dsHandle.setProperty( "odaURL", "jdbc:oracle:thin:@xeon:1521:ora9i" );
	        dsHandle.setProperty( "odaUser", "AIMS_GTMNE" );
	        dsHandle.setProperty( "odaPassword", "AIMS_GTMNE" );

	        designHandle.getDataSources( ).add( dsHandle );

	    }

	    void buildDataSet(ArrayList cols, String fromClause ) throws SemanticException
	    {

	        OdaDataSetHandle dsHandle = designFactory.newOdaDataSet( "ds",
	                "org.eclipse.birt.report.data.oda.jdbc.JdbcSelectDataSet" );
	        dsHandle.setDataSource( "Data Source" );
	        String qry = "Select ";
	        for( int i=0; i < cols.size(); i++){
	            qry += " " + cols.get(i);
	            if( i != (cols.size() -1) ){
	                qry += ",";
	            }

	        }
	        qry += " " + fromClause;

	        dsHandle.setQueryText( qry );

	        designHandle.getDataSets( ).add( dsHandle );



	    }
	    void buildReport(ArrayList cols, String fromClause ) throws IOException, SemanticException
	    {


	        //Configure the Engine and start the Platform
	        DesignConfig config = new DesignConfig( );

	        config.setProperty("BIRT_HOME", "D:/Softwares/Frame Works - APIs-Tools/birt-runtime-2_6_1/birt-runtime-2_6_1/ReportEngine");

	        IDesignEngine engine = null;
	        try{


	            Platform.startup( config );
	            IDesignEngineFactory factory = (IDesignEngineFactory) Platform.createFactoryObject( IDesignEngineFactory.EXTENSION_DESIGN_ENGINE_FACTORY );
	            engine = factory.createDesignEngine( config );

	        }catch( Exception ex){
	            ex.printStackTrace();
	        }       


	        SessionHandle session = engine.newSessionHandle( ULocale.ENGLISH ) ;



	        try{
	            //open a design or a template

	            designHandle = session.openDesign("D:/tempBirtReport/test.rptdesign");

	            designFactory = designHandle.getElementFactory( );

	            buildDataSource();
	            buildDataSet(cols, fromClause);

	            TableHandle table = designFactory.newTableItem( "table", cols.size() );
	            table.setWidth( "100%" );
	            table.setDataSet( designHandle.findDataSet( "ds" ) );


	            PropertyHandle computedSet = table.getColumnBindings( ); 
	            ComputedColumn  cs1 = null;

	            for( int i=0; i < cols.size(); i++){
	                cs1 = StructureFactory.createComputedColumn();
	                cs1.setName((String)cols.get(i));
	                cs1.setExpression("dataSetRow[\"" + (String)cols.get(i) + "\"]");
	                computedSet.addItem(cs1);
	            }


	            // table header
	            RowHandle tableheader = (RowHandle) table.getHeader( ).get( 0 );


	            for( int i=0; i < cols.size(); i++){
	                LabelHandle label1 = designFactory.newLabel( (String)cols.get(i) ); 
	                label1.setText((String)cols.get(i));
	                CellHandle cell = (CellHandle) tableheader.getCells( ).get( i );
	                cell.getContent( ).add( label1 );
	            }                           

	            // table detail
	            RowHandle tabledetail = (RowHandle) table.getDetail( ).get( 0 );
	            for( int i=0; i < cols.size(); i++){
	                CellHandle cell = (CellHandle) tabledetail.getCells( ).get( i );
	                DataItemHandle data = designFactory.newDataItem( "data_"+(String)cols.get(i) );
	                data.setResultSetColumn( (String)cols.get(i));
	                cell.getContent( ).add( data );
	            }

	            designHandle.getBody( ).add( table );

	            // Save the design and close it. 

	            designHandle.saveAs( "D:/tempBirtReport/test.rptdesign" ); //$NON-NLS-1$
	            designHandle.close( );
	            System.out.println("Finished");
	        }catch (Exception e){
	            e.printStackTrace();
	        }       

	    }
	 }
	 */
}
