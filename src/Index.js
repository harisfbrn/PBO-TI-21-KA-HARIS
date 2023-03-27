import React from 'react';
import {StyleSheet, View, Image, Text, TextInput, SafeAreaView} from 'react-native';

const Index = () => {
  return (
    <SafeAreaView style={styles.container}>

   <View style={{flexDirection:'column'}}>
    <View style={{backgroundColor:'black', width:"100%", height:500}}>
       <Image style={{alignSelf:"center", marginTop:"30%"}} source={require('../asset/img/icon.png')}></Image>
    </View>
    <View style={{backgroundColor:'grey', width:"100%", height:800, borderTopLeftRadius:80, marginTop:-100}}>
        <View>
            <Text style={{color:"white", textAlign:"center", marginTop:30, fontWeight:"bold", fontSize:22}}>Login</Text>
        </View>

        <View style={{flexDirection:'column'}}>
            <TextInput style={styles.input}
            placeholder="Email"
            />

            <TextInput style={{...styles.input, marginTop:-0.5}}
            placeholder="Password"
            />
        </View>
        <View style={{backgroundColor:"black", width:"80%", height:70, alignSelf:"center", borderRadius:10, marginTop: 30}}>
        <Text style={{color:"white", textAlign:"center", paddingTop:20, fontWeight:'bold', fontSize:18}}>Login</Text>
        </View>
    </View>
   </View>
   </SafeAreaView>
  );
};



export default Index;

const styles = StyleSheet.create({
    input: {
      height: 40,
      margin: 12,
      borderWidth: 2,
      padding: 10,
      width:"80%",
      alignSelf:"center",
      borderColor:"white",
      marginTop:"20%",
      
    },

    container: {
        flex: 1,
      },
  });
  