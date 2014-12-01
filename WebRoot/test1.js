Ext.onReady(function(){
	//Ext.window.MessageBox("提示信息","hello world");
	//Ext.define();
	var win = new Ext.Window({
        xtype: 'radiogroup',
        title: 'Radio Groups',
//		layout: "fit",
		autoHeight: true,
        //defaultType: 'radio', // each item will be a checkbox
        items: [{
    	 	xtype: 'radio',
            boxLabel: 'Dog',
            name: 'fav-animal',
            inputValue: 0
        }, {
        	xtype: 'radio',
            boxLabel: 'Cat',
            name: 'fav-animal',
            checked: true,
            inputValue: 1
        }, {
        	xtype: 'radio',
            boxLabel: 'Monkey',
            name: 'fav-animal',
            inputValue: 2,
            listeners:{
            	checked : function() {
            		alert("23");
	           	 }
            }
        }]
		
	}); 
	win.show();
	
});