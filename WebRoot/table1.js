Ext.onReady(function(){
	    var xg = Ext.grid;
        var sm = new xg.CheckboxSelectionModel();
        var grid2 = new xg.GridPanel({
        store: new Ext.data.Store({
            reader: Ext.getBody(),
            data: xg.dummyData
        }),
        cm: new xg.ColumnModel({
            defaults: {
                width: 120,
                sortable: true
            },
            columns: [
                sm,
                {id:'company',header: "Company", width: 200, dataIndex: 'company'},
                {header: "Price", renderer: Ext.util.Format.usMoney, dataIndex: 'price'},
                {header: "Change", dataIndex: 'change'},
                {header: "% Change", dataIndex: 'pctChange'},
                {header: "Last Updated", width: 135, renderer: Ext.util.Format.dateRenderer('m/d/Y'), dataIndex: 'lastChange'}
            ]
        }),
        sm: sm,
        columnLines: true,
        width:600,
        height:300,
        frame:true,
        title:'Framed with Checkbox Selection and Horizontal Scrolling',
        iconCls:'icon-grid',
        renderTo: document.body
    });
	
	
});