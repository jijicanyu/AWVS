Ext.onReady(function(){
	
	var win = new Ext.Window({
			bodyStyle: 'padding-right:5px;',
		 	title:'buttontest',
		 	minimizable:true,
		 	maximizable:true,
//		 	renderTo: Ext.getBody(),
		 	height: 300,
		 	width:200,
		 	tools:[{
		 	    id:'refresh',
		 	    qtip: 'Refresh form Data',
		 	    // hidden:true,
		 	    handler: function(event, toolEl, panel){
		 	        // refresh logic
		 	    }
		 	},
		 	{
		 	    id:'help',
		 	    qtip: 'Get Help',
		 	    handler: function(event, toolEl, panel){
		 	        // whatever
		 	    }
		 	}],
		 	tbar:[{
		 		text:"工具栏1"},{
		 		text:"工具栏2"
		 		
		 	}],
		 	items :{
		 	xtype:'button',
		 	text:'click me',
		 	id : 'button1',
			listeners : {
			 	click :buttonClick
//			 	click :function (){
////			 		alert("button clicked");
//			 		buttonClick();
//			 	}
			}
		}
	});
	
	win.show();
	
	function buttonClick() {
		alert("button clicked");
	 }
});