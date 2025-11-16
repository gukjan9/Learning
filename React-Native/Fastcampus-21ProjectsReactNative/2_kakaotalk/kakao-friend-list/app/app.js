import { StatusBar } from "expo-status-bar";
import { StyleSheet, Text, View } from "react-native";
import Header from "../src/Header";
import { SafeAreaProvider, SafeAreaView } from "react-native-safe-area-context";
import { getStatusBarHeight, getBottomSpace } from "react-native-iphone-x-helper"
import MyProfile from "../src/MyProfile";

const statusBarHeight = getStatusBarHeight(true);
const bottomSpace = getBottomSpace();

export default function App() {
    return (
        <View style={styles.container}>
            <Header />
            <Margin height={10} />
            <MyProfile
                uri={MyProfile.uri}
                name={MyProfile.name}
                introduction={MyProfile.introduction}
            />
        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: "#fff",
        paddingTop: statusBarHeight,
    },
});