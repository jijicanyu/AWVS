Ext.onReady(function(){
	//Ext.window.MessageBox("提示信息","hello world");
	var win = new Ext.Window({
					id: "mywin",
					title: "我是第一个窗口",
					x:400 ,
					y:300 ,
					height: 500 ,
					width : 500,
					//constrain: true
					constrainHeader: true, 
					//closable:false  ,//不显示关闭按钮
					draggable:true , //
					resizable:true,
					//collapsible:true,
					modal:true,
					tbar:[{
						text:"按钮1",
						handler:function(btn){
							//alert(btn.up('window').title);
						}
					},{
						text:"按钮2",
						handler:function(btn){
							alert(Ext.getCmp('mywin').title);
						}
					},{
						text:"按钮3",
						handler:function(btn){
							
						}
					}]
	}); 
	win.show();
	
});