import { StatusBar } from "expo-status-bar";
import { StyleSheet, Text, View } from "react-native";
import Header from "../src/Header";
import { SafeAreaProvider, SafeAreaView } from "react-native-safe-area-context";
import { getStatusBarHeight, getBottomSpace } from "react-native-iphone-x-helper"

const statusBarHeight = getStatusBarHeight(true);
const bottomSpace = getBottomSpace();

export default function App() {
    return (
        <SafeAreaProvider>
            <SafeAreaView style={styles.container} edges={['left', 'right']}
                <Header />

            <SafeAreaView />
        </SafeAreaProvider>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: "#fff",
        paddingTop: statusBarHeight,
    },
});