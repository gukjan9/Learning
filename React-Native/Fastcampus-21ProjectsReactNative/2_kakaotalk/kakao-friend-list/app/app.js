import { StatusBar } from "expo-status-bar";
import { StyleSheet, Text, View } from "react-native";
import Header from "../src/Header";
import { SafeAreaProvider, SafeAreaView } from "react-native-safe-area-context";
import { getStatusBarHeight, getBottomSpace } from "react-native-iphone-x-helper"
import Profile from "../src/Profile";
import Division from "../src/Division";
import Margin from "../src/Margin";
import FriendSection from "../src/FriendSection";

const statusBarHeight = getStatusBarHeight(true);
const bottomSpace = getBottomSpace();

export default function App() {
    return (
        <View style={styles.container}>
            <Header />
            <Margin height={10} />
            <MyProfile
                uri={Profile.uri}
                name={Profile.name}
                introduction={Profile.introduction}
            />
            <Margin height={15} />
            <Division />
            <Margin height={12} />
            <FriendSection
                friendProfileLen={freindProfiles.length}
                onPressArrow={onPressArrow} />

        </View>
    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: "#fff",
        paddingTop: statusBarHeight,
        paddingHorizontal: 15,
    },
});